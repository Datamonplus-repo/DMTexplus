package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tforacacopy1ww", "/app.tforacacopy1ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tforacacopy1ww extends GXWebObjectStub
{
   public tforacacopy1ww( )
   {
   }

   public tforacacopy1ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tforacacopy1ww.class ));
   }

   public tforacacopy1ww( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tforacacopy1ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tforacacopy1ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Tratamientos Quimicos";
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

