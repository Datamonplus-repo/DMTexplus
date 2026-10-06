package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcncyrcresumenxhdrexportcsv", "/app.wcncyrcresumenxhdrexportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcncyrcresumenxhdrexportcsv extends GXWebObjectStub
{
   public wcncyrcresumenxhdrexportcsv( )
   {
   }

   public wcncyrcresumenxhdrexportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcncyrcresumenxhdrexportcsv.class ));
   }

   public wcncyrcresumenxhdrexportcsv( int remoteHandle ,
                                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcncyrcresumenxhdrexportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcncyrcresumenxhdrexportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCNcy Rc Resumenx Hdr Export CSV";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

