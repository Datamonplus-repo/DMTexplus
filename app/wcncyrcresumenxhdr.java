package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcncyrcresumenxhdr", "/app.wcncyrcresumenxhdr"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcncyrcresumenxhdr extends GXWebObjectStub
{
   public wcncyrcresumenxhdr( )
   {
   }

   public wcncyrcresumenxhdr( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcncyrcresumenxhdr.class ));
   }

   public wcncyrcresumenxhdr( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcncyrcresumenxhdr_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcncyrcresumenxhdr_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCNcy Rc Resumenx Hdr";
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

