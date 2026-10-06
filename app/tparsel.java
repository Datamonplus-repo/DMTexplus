package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tparsel", "/app.tparsel"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparsel extends GXWebObjectStub
{
   public tparsel( )
   {
   }

   public tparsel( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparsel.class ));
   }

   public tparsel( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparsel_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparsel_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Parametros para SELLOS";
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

