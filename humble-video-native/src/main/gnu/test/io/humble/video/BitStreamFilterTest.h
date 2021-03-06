/*******************************************************************************
 * Copyright (c) 2014, Andrew "Art" Clarke.  All rights reserved.
 *
 * This file is part of Humble-Video.
 *
 * Humble-Video is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Humble-Video is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Humble-Video.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/

#ifndef SRC_MAIN_GNU_TEST_IO_HUMBLE_VIDEO_BITSTREAMFILTERTEST_H_
#define SRC_MAIN_GNU_TEST_IO_HUMBLE_VIDEO_BITSTREAMFILTERTEST_H_

#include <io/humble/testutils/TestUtils.h>
#include <io/humble/video/BitStreamFilter.h>
using namespace io::humble::video;
using namespace io::humble::ferry;

class BitStreamFilterTypeTest : public CxxTest::TestSuite
{
public:
  BitStreamFilterTypeTest();

  void testGetNumBitStreamFilterTypes();
  void testGetBitStreamFilterType();

  virtual ~BitStreamFilterTypeTest();
};

class BitStreamFilterTest : public CxxTest::TestSuite
{
public:
  BitStreamFilterTest ();

  void testMakeByName();
  void testMakeByType();

  /** Tests the noise filter, which allocates a output buffer */
  void testNoiseFilter();
  /** Tests the chomp filter, which does not allocate an output buffer in ffmpeg land */
  void testChompFilter();

  virtual ~BitStreamFilterTest ();
};

#endif /* SRC_MAIN_GNU_TEST_IO_HUMBLE_VIDEO_BITSTREAMFILTERTEST_H_ */
