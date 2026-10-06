package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tparundprompt", "/app.ficherosbasicos.tparundprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparundprompt extends GXWebObjectStub
{
   public tparundprompt( )
   {
   }

   public tparundprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparundprompt.class ));
   }

   public tparundprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparundprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparundprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona Unidades Parametros Fases";
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

