package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tparfasview", "/app.ficherosbasicos.tparfasview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparfasview extends GXWebObjectStub
{
   public tparfasview( )
   {
   }

   public tparfasview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparfasview.class ));
   }

   public tparfasview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparfasview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparfasview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPARFASView";
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

