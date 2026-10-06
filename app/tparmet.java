package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tparmet", "/app.tparmet"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparmet extends GXWebObjectStub
{
   public tparmet( )
   {
   }

   public tparmet( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparmet.class ));
   }

   public tparmet( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparmet_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparmet_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PARAMETROS ORGATEX";
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

