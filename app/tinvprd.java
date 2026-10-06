package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tinvprd", "/app.tinvprd"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tinvprd extends GXWebObjectStub
{
   public tinvprd( )
   {
   }

   public tinvprd( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tinvprd.class ));
   }

   public tinvprd( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tinvprd_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tinvprd_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RECUENTO PRODUCTOS II";
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

