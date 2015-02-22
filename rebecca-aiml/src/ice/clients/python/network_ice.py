# **********************************************************************
#
# Copyright (c) 2003-2007 ZeroC, Inc. All rights reserved.
#
# This copy of Ice is licensed to you under the terms described in the
# ICE_LICENSE file included in this distribution.
#
# **********************************************************************

# Ice version 3.2.1
# Generated from file `network.ice'

import Ice, IcePy, __builtin__

# Start of module rebecca
_M_rebecca = Ice.openModule('rebecca')
__name__ = 'rebecca'

# Start of module rebecca.impl
_M_rebecca.impl = Ice.openModule('rebecca.impl')
__name__ = 'rebecca.impl'

if not _M_rebecca.impl.__dict__.has_key('_t_StringSeq'):
    _M_rebecca.impl._t_StringSeq = IcePy.defineSequence('::rebecca::impl::StringSeq', (), IcePy._t_string)

if not _M_rebecca.impl.__dict__.has_key('CallBacksIce'):
    _M_rebecca.impl.CallBacksIce = Ice.createTempClass()
    class CallBacksIce(Ice.Object):
        def __init__(self):
            if __builtin__.type(self) == _M_rebecca.impl.CallBacksIce:
                raise RuntimeError('rebecca.impl.CallBacksIce is an abstract class')

        def ice_ids(self, current=None):
            return ('::Ice::Object', '::rebecca::impl::CallBacksIce')

        def ice_id(self, current=None):
            return '::rebecca::impl::CallBacksIce'

        #
        # Operation signatures.
        #
        # def storeGossip(self, gossip, userId, botId, endUserId, current=None):
        # def categoryLoaded(self, userId, botId, endUserId, current=None):
        # def filePreLoad(self, fileName, userId, botId, endUserId, current=None):
        # def filePostLoad(self, fileName, userId, botId, endUserId, current=None):
        # def symbolicReduction(self, symbol, userId, botId, endUserId, current=None):
        # def infiniteSymbolicReduction(self, userId, botId, endUserId, current=None):
        # def XMLParseError(self, message, userId, botId, endUserId, current=None):
        # def XMLParseWarning(self, message, userId, botId, endUserId, current=None):
        # def XMLParseFatalError(self, message, userId, botId, endUserId, current=None):
        # def thatStarTagSizeExceeded(self, userId, botId, endUserId, current=None):
        # def topicStarTagSizeExceeded(self, userId, botId, endUserId, current=None):
        # def starTagSizeExceeded(self, userId, botId, endUserId, current=None):
        # def inputTagNumericConversionError(self, message, userId, botId, endUserId, current=None):
        # def inputTagSizeExceeded(self, userId, botId, endUserId, current=None):
        # def starTagNumericConversionError(self, message, userId, botId, endUserId, current=None):
        # def thatTagSizeExceeded(self, userId, botId, endUserId, current=None):
        # def thatTagNumericConversionError(self, message, userId, botId, endUserId, current=None):
        # def topicStarTagNumericConversionError(self, message, userId, botId, endUserId, current=None):
        # def thatStarTagNumericConversionError(self, message, userId, botId, endUserId, current=None):
        # def learnTagFileNotFound(self, message, userId, botId, endUserId, current=None):

        def __str__(self):
            return IcePy.stringify(self, _M_rebecca.impl._t_CallBacksIce)

        __repr__ = __str__

    _M_rebecca.impl.CallBacksIcePrx = Ice.createTempClass()
    class CallBacksIcePrx(Ice.ObjectPrx):

        def storeGossip(self, gossip, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_storeGossip.invoke(self, (gossip, userId, botId, endUserId), _ctx)

        def categoryLoaded(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_categoryLoaded.invoke(self, (userId, botId, endUserId), _ctx)

        def filePreLoad(self, fileName, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_filePreLoad.invoke(self, (fileName, userId, botId, endUserId), _ctx)

        def filePostLoad(self, fileName, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_filePostLoad.invoke(self, (fileName, userId, botId, endUserId), _ctx)

        def symbolicReduction(self, symbol, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_symbolicReduction.invoke(self, (symbol, userId, botId, endUserId), _ctx)

        def infiniteSymbolicReduction(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_infiniteSymbolicReduction.invoke(self, (userId, botId, endUserId), _ctx)

        def XMLParseError(self, message, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_XMLParseError.invoke(self, (message, userId, botId, endUserId), _ctx)

        def XMLParseWarning(self, message, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_XMLParseWarning.invoke(self, (message, userId, botId, endUserId), _ctx)

        def XMLParseFatalError(self, message, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_XMLParseFatalError.invoke(self, (message, userId, botId, endUserId), _ctx)

        def thatStarTagSizeExceeded(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_thatStarTagSizeExceeded.invoke(self, (userId, botId, endUserId), _ctx)

        def topicStarTagSizeExceeded(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_topicStarTagSizeExceeded.invoke(self, (userId, botId, endUserId), _ctx)

        def starTagSizeExceeded(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_starTagSizeExceeded.invoke(self, (userId, botId, endUserId), _ctx)

        def inputTagNumericConversionError(self, message, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_inputTagNumericConversionError.invoke(self, (message, userId, botId, endUserId), _ctx)

        def inputTagSizeExceeded(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_inputTagSizeExceeded.invoke(self, (userId, botId, endUserId), _ctx)

        def starTagNumericConversionError(self, message, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_starTagNumericConversionError.invoke(self, (message, userId, botId, endUserId), _ctx)

        def thatTagSizeExceeded(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_thatTagSizeExceeded.invoke(self, (userId, botId, endUserId), _ctx)

        def thatTagNumericConversionError(self, message, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_thatTagNumericConversionError.invoke(self, (message, userId, botId, endUserId), _ctx)

        def topicStarTagNumericConversionError(self, message, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_topicStarTagNumericConversionError.invoke(self, (message, userId, botId, endUserId), _ctx)

        def thatStarTagNumericConversionError(self, message, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_thatStarTagNumericConversionError.invoke(self, (message, userId, botId, endUserId), _ctx)

        def learnTagFileNotFound(self, message, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.CallBacksIce._op_learnTagFileNotFound.invoke(self, (message, userId, botId, endUserId), _ctx)

        def checkedCast(proxy, facetOrCtx=None, _ctx=None):
            return _M_rebecca.impl.CallBacksIcePrx.ice_checkedCast(proxy, '::rebecca::impl::CallBacksIce', facetOrCtx, _ctx)
        checkedCast = staticmethod(checkedCast)

        def uncheckedCast(proxy, facet=None):
            return _M_rebecca.impl.CallBacksIcePrx.ice_uncheckedCast(proxy, facet)
        uncheckedCast = staticmethod(uncheckedCast)

    _M_rebecca.impl._t_CallBacksIcePrx = IcePy.defineProxy('::rebecca::impl::CallBacksIce', CallBacksIcePrx)

    _M_rebecca.impl._t_CallBacksIce = IcePy.defineClass('::rebecca::impl::CallBacksIce', CallBacksIce, (), True, None, (), ())
    CallBacksIce.ice_type = _M_rebecca.impl._t_CallBacksIce

    CallBacksIce._op_storeGossip = IcePy.Operation('storeGossip', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_categoryLoaded = IcePy.Operation('categoryLoaded', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_filePreLoad = IcePy.Operation('filePreLoad', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_filePostLoad = IcePy.Operation('filePostLoad', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_symbolicReduction = IcePy.Operation('symbolicReduction', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_infiniteSymbolicReduction = IcePy.Operation('infiniteSymbolicReduction', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_XMLParseError = IcePy.Operation('XMLParseError', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_XMLParseWarning = IcePy.Operation('XMLParseWarning', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_XMLParseFatalError = IcePy.Operation('XMLParseFatalError', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_thatStarTagSizeExceeded = IcePy.Operation('thatStarTagSizeExceeded', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_topicStarTagSizeExceeded = IcePy.Operation('topicStarTagSizeExceeded', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_starTagSizeExceeded = IcePy.Operation('starTagSizeExceeded', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_inputTagNumericConversionError = IcePy.Operation('inputTagNumericConversionError', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_inputTagSizeExceeded = IcePy.Operation('inputTagSizeExceeded', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_starTagNumericConversionError = IcePy.Operation('starTagNumericConversionError', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_thatTagSizeExceeded = IcePy.Operation('thatTagSizeExceeded', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_thatTagNumericConversionError = IcePy.Operation('thatTagNumericConversionError', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_topicStarTagNumericConversionError = IcePy.Operation('topicStarTagNumericConversionError', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_thatStarTagNumericConversionError = IcePy.Operation('thatStarTagNumericConversionError', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())
    CallBacksIce._op_learnTagFileNotFound = IcePy.Operation('learnTagFileNotFound', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, ())

    _M_rebecca.impl.CallBacksIce = CallBacksIce
    del CallBacksIce

    _M_rebecca.impl.CallBacksIcePrx = CallBacksIcePrx
    del CallBacksIcePrx

if not _M_rebecca.impl.__dict__.has_key('ExceptionIce'):
    _M_rebecca.impl.ExceptionIce = Ice.createTempClass()
    class ExceptionIce(Ice.UserException):
        def __init__(self, what=''):
            self.what = what

        def ice_name(self):
            return 'rebecca::impl::ExceptionIce'

        def __str__(self):
            return IcePy.stringifyException(self)

        __repr__ = __str__

    _M_rebecca.impl._t_ExceptionIce = IcePy.defineException('::rebecca::impl::ExceptionIce', ExceptionIce, (), None, (('what', (), IcePy._t_string),))
    ExceptionIce.ice_type = _M_rebecca.impl._t_ExceptionIce

    _M_rebecca.impl.ExceptionIce = ExceptionIce
    del ExceptionIce

if not _M_rebecca.impl.__dict__.has_key('FileNotFoundExceptionIce'):
    _M_rebecca.impl.FileNotFoundExceptionIce = Ice.createTempClass()
    class FileNotFoundExceptionIce(_M_rebecca.impl.ExceptionIce):
        def __init__(self, what=''):
            _M_rebecca.impl.ExceptionIce.__init__(self, what)

        def ice_name(self):
            return 'rebecca::impl::FileNotFoundExceptionIce'

        def __str__(self):
            return IcePy.stringifyException(self)

        __repr__ = __str__

    _M_rebecca.impl._t_FileNotFoundExceptionIce = IcePy.defineException('::rebecca::impl::FileNotFoundExceptionIce', FileNotFoundExceptionIce, (), _M_rebecca.impl._t_ExceptionIce, ())
    FileNotFoundExceptionIce.ice_type = _M_rebecca.impl._t_FileNotFoundExceptionIce

    _M_rebecca.impl.FileNotFoundExceptionIce = FileNotFoundExceptionIce
    del FileNotFoundExceptionIce

if not _M_rebecca.impl.__dict__.has_key('IllegalArgumentExceptionIce'):
    _M_rebecca.impl.IllegalArgumentExceptionIce = Ice.createTempClass()
    class IllegalArgumentExceptionIce(_M_rebecca.impl.ExceptionIce):
        def __init__(self, what=''):
            _M_rebecca.impl.ExceptionIce.__init__(self, what)

        def ice_name(self):
            return 'rebecca::impl::IllegalArgumentExceptionIce'

        def __str__(self):
            return IcePy.stringifyException(self)

        __repr__ = __str__

    _M_rebecca.impl._t_IllegalArgumentExceptionIce = IcePy.defineException('::rebecca::impl::IllegalArgumentExceptionIce', IllegalArgumentExceptionIce, (), _M_rebecca.impl._t_ExceptionIce, ())
    IllegalArgumentExceptionIce.ice_type = _M_rebecca.impl._t_IllegalArgumentExceptionIce

    _M_rebecca.impl.IllegalArgumentExceptionIce = IllegalArgumentExceptionIce
    del IllegalArgumentExceptionIce

if not _M_rebecca.impl.__dict__.has_key('DirectoryNotFoundExceptionIce'):
    _M_rebecca.impl.DirectoryNotFoundExceptionIce = Ice.createTempClass()
    class DirectoryNotFoundExceptionIce(_M_rebecca.impl.ExceptionIce):
        def __init__(self, what=''):
            _M_rebecca.impl.ExceptionIce.__init__(self, what)

        def ice_name(self):
            return 'rebecca::impl::DirectoryNotFoundExceptionIce'

        def __str__(self):
            return IcePy.stringifyException(self)

        __repr__ = __str__

    _M_rebecca.impl._t_DirectoryNotFoundExceptionIce = IcePy.defineException('::rebecca::impl::DirectoryNotFoundExceptionIce', DirectoryNotFoundExceptionIce, (), _M_rebecca.impl._t_ExceptionIce, ())
    DirectoryNotFoundExceptionIce.ice_type = _M_rebecca.impl._t_DirectoryNotFoundExceptionIce

    _M_rebecca.impl.DirectoryNotFoundExceptionIce = DirectoryNotFoundExceptionIce
    del DirectoryNotFoundExceptionIce

if not _M_rebecca.impl.__dict__.has_key('XMLErrorExceptionIce'):
    _M_rebecca.impl.XMLErrorExceptionIce = Ice.createTempClass()
    class XMLErrorExceptionIce(_M_rebecca.impl.ExceptionIce):
        def __init__(self, what=''):
            _M_rebecca.impl.ExceptionIce.__init__(self, what)

        def ice_name(self):
            return 'rebecca::impl::XMLErrorExceptionIce'

        def __str__(self):
            return IcePy.stringifyException(self)

        __repr__ = __str__

    _M_rebecca.impl._t_XMLErrorExceptionIce = IcePy.defineException('::rebecca::impl::XMLErrorExceptionIce', XMLErrorExceptionIce, (), _M_rebecca.impl._t_ExceptionIce, ())
    XMLErrorExceptionIce.ice_type = _M_rebecca.impl._t_XMLErrorExceptionIce

    _M_rebecca.impl.XMLErrorExceptionIce = XMLErrorExceptionIce
    del XMLErrorExceptionIce

if not _M_rebecca.impl.__dict__.has_key('NetworkGraphBuilderIce'):
    _M_rebecca.impl.NetworkGraphBuilderIce = Ice.createTempClass()
    class NetworkGraphBuilderIce(Ice.Object):
        def __init__(self):
            if __builtin__.type(self) == _M_rebecca.impl.NetworkGraphBuilderIce:
                raise RuntimeError('rebecca.impl.NetworkGraphBuilderIce is an abstract class')

        def ice_ids(self, current=None):
            return ('::Ice::Object', '::rebecca::impl::NetworkGraphBuilderIce')

        def ice_id(self, current=None):
            return '::rebecca::impl::NetworkGraphBuilderIce'

        #
        # Operation signatures.
        #
        # def addFile(self, file, userId, botId, endUserId, current=None):
        # def addFileUnlessAlreadyAdded(self, file, userId, botId, endUserId, current=None):
        # def removeFile(self, file, userId, botId, endUserId, current=None):
        # def addDirectory(self, directory, userId, botId, endUserId, current=None):
        # def addDirectoryWithFilesEndingInRegularExpression(self, directory, regularExpression, userId, botId, endUserId, current=None):
        # def addDirectoryUnlessAlreadyAdded(self, directory, userId, botId, endUserId, current=None):
        # def addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(self, directory, regularExpression, userId, botId, endUserId, current=None):
        # def removeDirectory(self, directory, userId, botId, endUserId, current=None):
        # def removeDirectoryWithFilesEndingInRegularExpression(self, directory, regularExpression, userId, botId, endUserId, current=None):
        # def addString(self, stringContainingAIML, userId, botId, endUserId, current=None):
        # def removeString(self, stringContainingAIML, userId, botId, endUserId, current=None):
        # def setAddStringAIMLHeader(self, aimlHeader, current=None):
        # def setAddStringAIMLFooter(self, aimlFooter, current=None):
        # def setAIMLSchema(self, schema, current=None):
        # def setCommonTypesSchema(self, schema, current=None):
        # def setAIMLValidation(self, trueOrFalse, current=None):
        # def getResponse(self, input, userId, botId, endUserId, current=None):
        # def setThat(self, that, userId, botId, endUserId, current=None):
        # def setTopic(self, topic, userId, botId, endUserId, current=None):
        # def getThat(self, userId, botId, endUserId, current=None):
        # def getTopic(self, userId, botId, endUserId, current=None):
        # def createGraph(self, userId, botId, endUserId, current=None):
        # def removeGraph(self, userId, botId, endUserId, current=None):
        # def predicateMatch(self, predicateName, aimlPattern, userId, botId, endUserId, current=None):
        # def setPredicate(self, name, value, userId, botId, endUserId, current=None):
        # def getPredicate(self, name, userId, botId, endUserId, current=None):
        # def getBotPredicate(self, name, userId, botId, endUserId, current=None):
        # def setBotPredicate(self, name, value, userId, botId, endUserId, current=None):
        # def getPreviousBotResponse(self, previousBotResponse, sentence, userId, botId, endUserId, current=None):
        # def getPreviousUserInput(self, previousUserInput, sentence, userId, botId, endUserId, current=None):
        # def setBotConfigurationSchema(self, schema, current=None):
        # def setBotConfigurationValidation(self, trueOrFalse, current=None):
        # def parseSubstitutionFile(self, fileName, current=None):
        # def parseSentenceSplitterFile(self, fileName, current=None):
        # def parsePropertiesFile(self, fileName, userId, botId, endUserId, current=None):
        # def setSentenceSplitter(self, splitter, current=None):
        # def setInputSubstitution(self, find, replace, current=None):
        # def setGenderSubstitution(self, find, replace, current=None):
        # def setPersonSubstitution(self, find, replace, current=None):
        # def setPerson2Substitution(self, find, replace, current=None):
        # def getVersion(self, current=None):
        # def getSize(self, userId, botId, endUserId, current=None):
        # def setCallBacks(self, name, category, current=None):
        # def storeGossip(self, gossip, current=None):
        # def getId(self, current=None):
        # def addCustomTagLibrary(self, library, current=None):
        # def removeCustomTagLibrary(self, library, current=None):
        # def callSystemCommand(self, command, current=None):
        # def synchronizeDatabase(self, current=None):
        # def getAIMLFileList(self, userId, botId, endUserId, current=None):
        # def getAIMLFileListSize(self, userId, botId, endUserId, current=None):
        # def getAIMLStringList(self, userId, botId, endUserId, current=None):
        # def getAIMLStringListSize(self, userId, botId, endUserId, current=None):
        # def getUserIds(self, current=None):
        # def getUserIdsSize(self, current=None):
        # def getBotIds(self, userId, current=None):
        # def getBotIdsSize(self, userId, current=None):
        # def getEndUserIds(self, userId, botId, current=None):
        # def getEndUserIdsSize(self, userId, botId, current=None):
        # def printEntireDatabase(self, current=None):
        # def getBotPredicates(self, userId, botId, endUserId, current=None):
        # def getPredicates(self, userId, botId, endUserId, current=None):
        # def getBotPredicatesSize(self, userId, botId, endUserId, current=None):
        # def getPredicatesSize(self, userId, botId, endUserId, current=None):
        # def removePredicate(self, name, userId, botId, endUserId, current=None):
        # def removeBotPredicate(self, name, userId, botId, endUserId, current=None):
        # def removeEndUser(self, userId, botId, endUserId, current=None):
        # def removeBot(self, userId, botId, current=None):
        # def removeUser(self, userId, current=None):

        def __str__(self):
            return IcePy.stringify(self, _M_rebecca.impl._t_NetworkGraphBuilderIce)

        __repr__ = __str__

    _M_rebecca.impl.NetworkGraphBuilderIcePrx = Ice.createTempClass()
    class NetworkGraphBuilderIcePrx(Ice.ObjectPrx):

        def addFile(self, file, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_addFile.invoke(self, (file, userId, botId, endUserId), _ctx)

        def addFileUnlessAlreadyAdded(self, file, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_addFileUnlessAlreadyAdded.invoke(self, (file, userId, botId, endUserId), _ctx)

        def removeFile(self, file, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_removeFile.invoke(self, (file, userId, botId, endUserId), _ctx)

        def addDirectory(self, directory, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_addDirectory.invoke(self, (directory, userId, botId, endUserId), _ctx)

        def addDirectoryWithFilesEndingInRegularExpression(self, directory, regularExpression, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_addDirectoryWithFilesEndingInRegularExpression.invoke(self, (directory, regularExpression, userId, botId, endUserId), _ctx)

        def addDirectoryUnlessAlreadyAdded(self, directory, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_addDirectoryUnlessAlreadyAdded.invoke(self, (directory, userId, botId, endUserId), _ctx)

        def addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded(self, directory, regularExpression, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded.invoke(self, (directory, regularExpression, userId, botId, endUserId), _ctx)

        def removeDirectory(self, directory, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_removeDirectory.invoke(self, (directory, userId, botId, endUserId), _ctx)

        def removeDirectoryWithFilesEndingInRegularExpression(self, directory, regularExpression, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_removeDirectoryWithFilesEndingInRegularExpression.invoke(self, (directory, regularExpression, userId, botId, endUserId), _ctx)

        def addString(self, stringContainingAIML, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_addString.invoke(self, (stringContainingAIML, userId, botId, endUserId), _ctx)

        def removeString(self, stringContainingAIML, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_removeString.invoke(self, (stringContainingAIML, userId, botId, endUserId), _ctx)

        def setAddStringAIMLHeader(self, aimlHeader, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setAddStringAIMLHeader.invoke(self, (aimlHeader, ), _ctx)

        def setAddStringAIMLFooter(self, aimlFooter, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setAddStringAIMLFooter.invoke(self, (aimlFooter, ), _ctx)

        def setAIMLSchema(self, schema, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setAIMLSchema.invoke(self, (schema, ), _ctx)

        def setCommonTypesSchema(self, schema, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setCommonTypesSchema.invoke(self, (schema, ), _ctx)

        def setAIMLValidation(self, trueOrFalse, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setAIMLValidation.invoke(self, (trueOrFalse, ), _ctx)

        def getResponse(self, input, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getResponse.invoke(self, (input, userId, botId, endUserId), _ctx)

        def setThat(self, that, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setThat.invoke(self, (that, userId, botId, endUserId), _ctx)

        def setTopic(self, topic, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setTopic.invoke(self, (topic, userId, botId, endUserId), _ctx)

        def getThat(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getThat.invoke(self, (userId, botId, endUserId), _ctx)

        def getTopic(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getTopic.invoke(self, (userId, botId, endUserId), _ctx)

        def createGraph(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_createGraph.invoke(self, (userId, botId, endUserId), _ctx)

        def removeGraph(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_removeGraph.invoke(self, (userId, botId, endUserId), _ctx)

        def predicateMatch(self, predicateName, aimlPattern, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_predicateMatch.invoke(self, (predicateName, aimlPattern, userId, botId, endUserId), _ctx)

        def setPredicate(self, name, value, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setPredicate.invoke(self, (name, value, userId, botId, endUserId), _ctx)

        def getPredicate(self, name, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getPredicate.invoke(self, (name, userId, botId, endUserId), _ctx)

        def getBotPredicate(self, name, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getBotPredicate.invoke(self, (name, userId, botId, endUserId), _ctx)

        def setBotPredicate(self, name, value, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setBotPredicate.invoke(self, (name, value, userId, botId, endUserId), _ctx)

        def getPreviousBotResponse(self, previousBotResponse, sentence, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getPreviousBotResponse.invoke(self, (previousBotResponse, sentence, userId, botId, endUserId), _ctx)

        def getPreviousUserInput(self, previousUserInput, sentence, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getPreviousUserInput.invoke(self, (previousUserInput, sentence, userId, botId, endUserId), _ctx)

        def setBotConfigurationSchema(self, schema, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setBotConfigurationSchema.invoke(self, (schema, ), _ctx)

        def setBotConfigurationValidation(self, trueOrFalse, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setBotConfigurationValidation.invoke(self, (trueOrFalse, ), _ctx)

        def parseSubstitutionFile(self, fileName, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_parseSubstitutionFile.invoke(self, (fileName, ), _ctx)

        def parseSentenceSplitterFile(self, fileName, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_parseSentenceSplitterFile.invoke(self, (fileName, ), _ctx)

        def parsePropertiesFile(self, fileName, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_parsePropertiesFile.invoke(self, (fileName, userId, botId, endUserId), _ctx)

        def setSentenceSplitter(self, splitter, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setSentenceSplitter.invoke(self, (splitter, ), _ctx)

        def setInputSubstitution(self, find, replace, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setInputSubstitution.invoke(self, (find, replace), _ctx)

        def setGenderSubstitution(self, find, replace, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setGenderSubstitution.invoke(self, (find, replace), _ctx)

        def setPersonSubstitution(self, find, replace, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setPersonSubstitution.invoke(self, (find, replace), _ctx)

        def setPerson2Substitution(self, find, replace, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setPerson2Substitution.invoke(self, (find, replace), _ctx)

        def getVersion(self, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getVersion.invoke(self, (), _ctx)

        def getSize(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getSize.invoke(self, (userId, botId, endUserId), _ctx)

        def setCallBacks(self, name, category, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_setCallBacks.invoke(self, (name, category), _ctx)

        def storeGossip(self, gossip, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_storeGossip.invoke(self, (gossip, ), _ctx)

        def getId(self, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getId.invoke(self, (), _ctx)

        def addCustomTagLibrary(self, library, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_addCustomTagLibrary.invoke(self, (library, ), _ctx)

        def removeCustomTagLibrary(self, library, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_removeCustomTagLibrary.invoke(self, (library, ), _ctx)

        def callSystemCommand(self, command, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_callSystemCommand.invoke(self, (command, ), _ctx)

        def synchronizeDatabase(self, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_synchronizeDatabase.invoke(self, (), _ctx)

        def getAIMLFileList(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getAIMLFileList.invoke(self, (userId, botId, endUserId), _ctx)

        def getAIMLFileListSize(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getAIMLFileListSize.invoke(self, (userId, botId, endUserId), _ctx)

        def getAIMLStringList(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getAIMLStringList.invoke(self, (userId, botId, endUserId), _ctx)

        def getAIMLStringListSize(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getAIMLStringListSize.invoke(self, (userId, botId, endUserId), _ctx)

        def getUserIds(self, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getUserIds.invoke(self, (), _ctx)

        def getUserIdsSize(self, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getUserIdsSize.invoke(self, (), _ctx)

        def getBotIds(self, userId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getBotIds.invoke(self, (userId, ), _ctx)

        def getBotIdsSize(self, userId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getBotIdsSize.invoke(self, (userId, ), _ctx)

        def getEndUserIds(self, userId, botId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getEndUserIds.invoke(self, (userId, botId), _ctx)

        def getEndUserIdsSize(self, userId, botId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getEndUserIdsSize.invoke(self, (userId, botId), _ctx)

        def printEntireDatabase(self, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_printEntireDatabase.invoke(self, (), _ctx)

        def getBotPredicates(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getBotPredicates.invoke(self, (userId, botId, endUserId), _ctx)

        def getPredicates(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getPredicates.invoke(self, (userId, botId, endUserId), _ctx)

        def getBotPredicatesSize(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getBotPredicatesSize.invoke(self, (userId, botId, endUserId), _ctx)

        def getPredicatesSize(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_getPredicatesSize.invoke(self, (userId, botId, endUserId), _ctx)

        def removePredicate(self, name, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_removePredicate.invoke(self, (name, userId, botId, endUserId), _ctx)

        def removeBotPredicate(self, name, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_removeBotPredicate.invoke(self, (name, userId, botId, endUserId), _ctx)

        def removeEndUser(self, userId, botId, endUserId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_removeEndUser.invoke(self, (userId, botId, endUserId), _ctx)

        def removeBot(self, userId, botId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_removeBot.invoke(self, (userId, botId), _ctx)

        def removeUser(self, userId, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIce._op_removeUser.invoke(self, (userId, ), _ctx)

        def checkedCast(proxy, facetOrCtx=None, _ctx=None):
            return _M_rebecca.impl.NetworkGraphBuilderIcePrx.ice_checkedCast(proxy, '::rebecca::impl::NetworkGraphBuilderIce', facetOrCtx, _ctx)
        checkedCast = staticmethod(checkedCast)

        def uncheckedCast(proxy, facet=None):
            return _M_rebecca.impl.NetworkGraphBuilderIcePrx.ice_uncheckedCast(proxy, facet)
        uncheckedCast = staticmethod(uncheckedCast)

    _M_rebecca.impl._t_NetworkGraphBuilderIcePrx = IcePy.defineProxy('::rebecca::impl::NetworkGraphBuilderIce', NetworkGraphBuilderIcePrx)

    _M_rebecca.impl._t_NetworkGraphBuilderIce = IcePy.defineClass('::rebecca::impl::NetworkGraphBuilderIce', NetworkGraphBuilderIce, (), True, None, (), ())
    NetworkGraphBuilderIce.ice_type = _M_rebecca.impl._t_NetworkGraphBuilderIce

    NetworkGraphBuilderIce._op_addFile = IcePy.Operation('addFile', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_FileNotFoundExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_addFileUnlessAlreadyAdded = IcePy.Operation('addFileUnlessAlreadyAdded', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_FileNotFoundExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_removeFile = IcePy.Operation('removeFile', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_FileNotFoundExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_addDirectory = IcePy.Operation('addDirectory', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_IllegalArgumentExceptionIce, _M_rebecca.impl._t_DirectoryNotFoundExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_addDirectoryWithFilesEndingInRegularExpression = IcePy.Operation('addDirectoryWithFilesEndingInRegularExpression', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_IllegalArgumentExceptionIce, _M_rebecca.impl._t_DirectoryNotFoundExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_addDirectoryUnlessAlreadyAdded = IcePy.Operation('addDirectoryUnlessAlreadyAdded', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_IllegalArgumentExceptionIce, _M_rebecca.impl._t_DirectoryNotFoundExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded = IcePy.Operation('addDirectoryWithFilesEndingInRegularExpressionUnlessAlreadyAdded', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_IllegalArgumentExceptionIce, _M_rebecca.impl._t_DirectoryNotFoundExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_removeDirectory = IcePy.Operation('removeDirectory', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_IllegalArgumentExceptionIce, _M_rebecca.impl._t_DirectoryNotFoundExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_removeDirectoryWithFilesEndingInRegularExpression = IcePy.Operation('removeDirectoryWithFilesEndingInRegularExpression', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_IllegalArgumentExceptionIce, _M_rebecca.impl._t_DirectoryNotFoundExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_addString = IcePy.Operation('addString', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_removeString = IcePy.Operation('removeString', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_setAddStringAIMLHeader = IcePy.Operation('setAddStringAIMLHeader', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string),), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_setAddStringAIMLFooter = IcePy.Operation('setAddStringAIMLFooter', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string),), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_setAIMLSchema = IcePy.Operation('setAIMLSchema', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string),), (), None, (_M_rebecca.impl._t_ExceptionIce, _M_rebecca.impl._t_FileNotFoundExceptionIce))
    NetworkGraphBuilderIce._op_setCommonTypesSchema = IcePy.Operation('setCommonTypesSchema', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string),), (), None, (_M_rebecca.impl._t_ExceptionIce, _M_rebecca.impl._t_FileNotFoundExceptionIce))
    NetworkGraphBuilderIce._op_setAIMLValidation = IcePy.Operation('setAIMLValidation', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_bool),), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getResponse = IcePy.Operation('getResponse', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), IcePy._t_string, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_setThat = IcePy.Operation('setThat', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_setTopic = IcePy.Operation('setTopic', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getThat = IcePy.Operation('getThat', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), IcePy._t_string, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getTopic = IcePy.Operation('getTopic', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), IcePy._t_string, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_createGraph = IcePy.Operation('createGraph', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_XMLErrorExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_removeGraph = IcePy.Operation('removeGraph', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_XMLErrorExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_predicateMatch = IcePy.Operation('predicateMatch', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), IcePy._t_bool, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_setPredicate = IcePy.Operation('setPredicate', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getPredicate = IcePy.Operation('getPredicate', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), IcePy._t_string, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getBotPredicate = IcePy.Operation('getBotPredicate', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), IcePy._t_string, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_setBotPredicate = IcePy.Operation('setBotPredicate', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getPreviousBotResponse = IcePy.Operation('getPreviousBotResponse', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_int), ((), IcePy._t_int), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), IcePy._t_string, (_M_rebecca.impl._t_IllegalArgumentExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_getPreviousUserInput = IcePy.Operation('getPreviousUserInput', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_int), ((), IcePy._t_int), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), IcePy._t_string, (_M_rebecca.impl._t_IllegalArgumentExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_setBotConfigurationSchema = IcePy.Operation('setBotConfigurationSchema', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string),), (), None, (_M_rebecca.impl._t_ExceptionIce, _M_rebecca.impl._t_FileNotFoundExceptionIce))
    NetworkGraphBuilderIce._op_setBotConfigurationValidation = IcePy.Operation('setBotConfigurationValidation', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_bool),), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_parseSubstitutionFile = IcePy.Operation('parseSubstitutionFile', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string),), (), None, (_M_rebecca.impl._t_XMLErrorExceptionIce, _M_rebecca.impl._t_FileNotFoundExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_parseSentenceSplitterFile = IcePy.Operation('parseSentenceSplitterFile', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string),), (), None, (_M_rebecca.impl._t_XMLErrorExceptionIce, _M_rebecca.impl._t_FileNotFoundExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_parsePropertiesFile = IcePy.Operation('parsePropertiesFile', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_XMLErrorExceptionIce, _M_rebecca.impl._t_FileNotFoundExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_setSentenceSplitter = IcePy.Operation('setSentenceSplitter', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string),), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_setInputSubstitution = IcePy.Operation('setInputSubstitution', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_IllegalArgumentExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_setGenderSubstitution = IcePy.Operation('setGenderSubstitution', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_IllegalArgumentExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_setPersonSubstitution = IcePy.Operation('setPersonSubstitution', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_IllegalArgumentExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_setPerson2Substitution = IcePy.Operation('setPerson2Substitution', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_IllegalArgumentExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_getVersion = IcePy.Operation('getVersion', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (), (), IcePy._t_string, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getSize = IcePy.Operation('getSize', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), IcePy._t_int, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_setCallBacks = IcePy.Operation('setCallBacks', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_storeGossip = IcePy.Operation('storeGossip', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string),), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getId = IcePy.Operation('getId', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (), (), IcePy._t_string, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_addCustomTagLibrary = IcePy.Operation('addCustomTagLibrary', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string),), (), None, (_M_rebecca.impl._t_FileNotFoundExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_removeCustomTagLibrary = IcePy.Operation('removeCustomTagLibrary', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string),), (), None, (_M_rebecca.impl._t_FileNotFoundExceptionIce, _M_rebecca.impl._t_ExceptionIce))
    NetworkGraphBuilderIce._op_callSystemCommand = IcePy.Operation('callSystemCommand', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string),), (), IcePy._t_string, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_synchronizeDatabase = IcePy.Operation('synchronizeDatabase', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getAIMLFileList = IcePy.Operation('getAIMLFileList', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), _M_rebecca.impl._t_StringSeq, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getAIMLFileListSize = IcePy.Operation('getAIMLFileListSize', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), IcePy._t_int, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getAIMLStringList = IcePy.Operation('getAIMLStringList', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), _M_rebecca.impl._t_StringSeq, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getAIMLStringListSize = IcePy.Operation('getAIMLStringListSize', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), IcePy._t_int, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getUserIds = IcePy.Operation('getUserIds', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (), (), _M_rebecca.impl._t_StringSeq, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getUserIdsSize = IcePy.Operation('getUserIdsSize', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (), (), IcePy._t_int, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getBotIds = IcePy.Operation('getBotIds', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string),), (), _M_rebecca.impl._t_StringSeq, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getBotIdsSize = IcePy.Operation('getBotIdsSize', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string),), (), IcePy._t_int, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getEndUserIds = IcePy.Operation('getEndUserIds', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string)), (), _M_rebecca.impl._t_StringSeq, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getEndUserIdsSize = IcePy.Operation('getEndUserIdsSize', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string)), (), IcePy._t_int, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_printEntireDatabase = IcePy.Operation('printEntireDatabase', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getBotPredicates = IcePy.Operation('getBotPredicates', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), _M_rebecca.impl._t_StringSeq, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getPredicates = IcePy.Operation('getPredicates', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), _M_rebecca.impl._t_StringSeq, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getBotPredicatesSize = IcePy.Operation('getBotPredicatesSize', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), IcePy._t_int, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_getPredicatesSize = IcePy.Operation('getPredicatesSize', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), IcePy._t_int, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_removePredicate = IcePy.Operation('removePredicate', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_removeBotPredicate = IcePy.Operation('removeBotPredicate', Ice.OperationMode.Idempotent, Ice.OperationMode.Idempotent, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_removeEndUser = IcePy.Operation('removeEndUser', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_removeBot = IcePy.Operation('removeBot', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string), ((), IcePy._t_string)), (), None, (_M_rebecca.impl._t_ExceptionIce,))
    NetworkGraphBuilderIce._op_removeUser = IcePy.Operation('removeUser', Ice.OperationMode.Normal, Ice.OperationMode.Normal, False, (), (((), IcePy._t_string),), (), None, (_M_rebecca.impl._t_ExceptionIce,))

    _M_rebecca.impl.NetworkGraphBuilderIce = NetworkGraphBuilderIce
    del NetworkGraphBuilderIce

    _M_rebecca.impl.NetworkGraphBuilderIcePrx = NetworkGraphBuilderIcePrx
    del NetworkGraphBuilderIcePrx

# End of module rebecca.impl

__name__ = 'rebecca'

# End of module rebecca
