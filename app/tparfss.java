package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tparfss", "/app.tparfss"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparfss extends GXWebObjectStub
{
   public tparfss( )
   {
   }

   public tparfss( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparfss.class ));
   }

   public tparfss( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparfss_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparfss_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PARAMATEROS POR FASES STANDAR";
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

