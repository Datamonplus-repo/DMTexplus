package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatsusww", "/app.tcatsusww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatsusww extends GXWebObjectStub
{
   public tcatsusww( )
   {
   }

   public tcatsusww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatsusww.class ));
   }

   public tcatsusww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatsusww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatsusww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Sustancias a controlar en Thelist";
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

