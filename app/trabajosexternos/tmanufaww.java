package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.tmanufaww", "/app.trabajosexternos.tmanufaww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tmanufaww extends GXWebObjectStub
{
   public tmanufaww( )
   {
   }

   public tmanufaww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tmanufaww.class ));
   }

   public tmanufaww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tmanufaww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tmanufaww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Manufacturadores";
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

