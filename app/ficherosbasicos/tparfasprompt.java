package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tparfasprompt", "/app.ficherosbasicos.tparfasprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparfasprompt extends GXWebObjectStub
{
   public tparfasprompt( )
   {
   }

   public tparfasprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparfasprompt.class ));
   }

   public tparfasprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparfasprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparfasprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona PARAMETROS FASES PRODUCCION";
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

