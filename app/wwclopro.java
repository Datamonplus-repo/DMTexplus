package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wwclopro", "/app.wwclopro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwclopro extends GXWebObjectStub
{
   public wwclopro( )
   {
   }

   public wwclopro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwclopro.class ));
   }

   public wwclopro( int remoteHandle ,
                    ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwclopro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwclopro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "DUPLICACION DE PRODUCCION";
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

