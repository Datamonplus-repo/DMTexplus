package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tparfssww", "/app.tparfssww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparfssww extends GXWebObjectStub
{
   public tparfssww( )
   {
   }

   public tparfssww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparfssww.class ));
   }

   public tparfssww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparfssww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparfssww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " PARAMATEROS POR FASES STANDAR";
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

