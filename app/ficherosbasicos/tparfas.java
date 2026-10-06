package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tparfas", "/app.ficherosbasicos.tparfas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparfas extends GXWebObjectStub
{
   public tparfas( )
   {
   }

   public tparfas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparfas.class ));
   }

   public tparfas( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparfas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparfas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PARAMETROS FASES PRODUCCION";
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

