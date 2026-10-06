package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tparund", "/app.ficherosbasicos.tparund"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparund extends GXWebObjectStub
{
   public tparund( )
   {
   }

   public tparund( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparund.class ));
   }

   public tparund( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparund_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparund_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Unidades Parametros Fases";
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

