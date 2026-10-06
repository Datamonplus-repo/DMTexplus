package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tparfssview", "/app.tparfssview"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparfssview extends GXWebObjectStub
{
   public tparfssview( )
   {
   }

   public tparfssview( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparfssview.class ));
   }

   public tparfssview( int remoteHandle ,
                       ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparfssview_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparfssview_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPARFSSView";
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

