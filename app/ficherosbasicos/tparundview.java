package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tparundview", "/app.ficherosbasicos.tparundview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparundview extends GXWebObjectStub
{
   public tparundview( )
   {
   }

   public tparundview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparundview.class ));
   }

   public tparundview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparundview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparundview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPARUNDView";
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

