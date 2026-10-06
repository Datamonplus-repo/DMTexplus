package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tparpro", "/app.tparpro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparpro extends GXWebObjectStub
{
   public tparpro( )
   {
   }

   public tparpro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparpro.class ));
   }

   public tparpro( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparpro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparpro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PARTES PRODUCCION";
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

