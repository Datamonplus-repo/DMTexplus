package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tparundgeneral", "/app.ficherosbasicos.tparundgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparundgeneral extends GXWebObjectStub
{
   public tparundgeneral( )
   {
   }

   public tparundgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparundgeneral.class ));
   }

   public tparundgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparundgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparundgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPARUNDGeneral";
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

