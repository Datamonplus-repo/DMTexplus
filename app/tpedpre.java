package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpedpre", "/app.tpedpre"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedpre extends GXWebObjectStub
{
   public tpedpre( )
   {
   }

   public tpedpre( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedpre.class ));
   }

   public tpedpre( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedpre_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedpre_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PRECIOS Unidad y Kilo";
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

