package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tparfasgeneral", "/app.ficherosbasicos.tparfasgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparfasgeneral extends GXWebObjectStub
{
   public tparfasgeneral( )
   {
   }

   public tparfasgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparfasgeneral.class ));
   }

   public tparfasgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparfasgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparfasgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPARFASGeneral";
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

