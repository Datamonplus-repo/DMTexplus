package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tparfssgeneral", "/app.tparfssgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparfssgeneral extends GXWebObjectStub
{
   public tparfssgeneral( )
   {
   }

   public tparfssgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparfssgeneral.class ));
   }

   public tparfssgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparfssgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparfssgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TPARFSSGeneral";
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

