package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tforacacopy1", "/app.tforacacopy1"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tforacacopy1 extends GXWebObjectStub
{
   public tforacacopy1( )
   {
   }

   public tforacacopy1( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tforacacopy1.class ));
   }

   public tforacacopy1( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tforacacopy1_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tforacacopy1_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tratamientos Quimicos";
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

