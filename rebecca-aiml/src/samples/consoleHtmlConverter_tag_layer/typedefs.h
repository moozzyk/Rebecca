#ifndef CUSTOMHTML_TYPEDEFS_H
#define CUSTOMHTML_TYPEDEFS_H

/*
 * RebeccaAIML, Artificial Intelligence Markup Language 
 * C++ api and engine.
 *
 * Copyright (C) 2005,2006,2007 Frank Hassanabad
 *
 * This file is part of RebeccaAIML.
 *
 * RebeccaAIML is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * RebeccaAIML is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */



#include <map>

namespace customTag
{
namespace impl
{

/*
 * Forward declerations
 */
class Links;
class WebPage;
using namespace std;

/*
 * Typedefs to make life easier
 */

/**
 * A map of string to Links
 */
typedef map<string, Links> MapStringLinks;

/**
 * A map of WebPages to a Map of string to links
 */
typedef map<WebPage, MapStringLinks> MapWebPageMapStringLinks;

} //end of impl namespace
} //end of customTag namespace

#endif
