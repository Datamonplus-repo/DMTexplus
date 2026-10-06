package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tintfacgeneral", "/app.formulaciontinte.tintfacgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tintfacgeneral extends GXWebObjectStub
{
   public tintfacgeneral( )
   {
   }

   public tintfacgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tintfacgeneral.class ));
   }

   public tintfacgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tintfacgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tintfacgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TINTFACGeneral";
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

