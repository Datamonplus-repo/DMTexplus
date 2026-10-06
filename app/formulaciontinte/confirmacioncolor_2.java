package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.confirmacioncolor_2", "/app.formulaciontinte.confirmacioncolor_2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class confirmacioncolor_2 extends GXWebObjectStub
{
   public confirmacioncolor_2( )
   {
   }

   public confirmacioncolor_2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( confirmacioncolor_2.class ));
   }

   public confirmacioncolor_2( int remoteHandle ,
                               ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new confirmacioncolor_2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new confirmacioncolor_2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Confirmacion Color";
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

