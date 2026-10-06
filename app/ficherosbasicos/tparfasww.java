package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tparfasww", "/app.ficherosbasicos.tparfasww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparfasww extends GXWebObjectStub
{
   public tparfasww( )
   {
   }

   public tparfasww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparfasww.class ));
   }

   public tparfasww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparfasww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparfasww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " PARAMETROS FASES PRODUCCION";
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

