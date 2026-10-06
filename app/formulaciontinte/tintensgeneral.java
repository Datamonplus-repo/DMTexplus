package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tintensgeneral", "/app.formulaciontinte.tintensgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tintensgeneral extends GXWebObjectStub
{
   public tintensgeneral( )
   {
   }

   public tintensgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tintensgeneral.class ));
   }

   public tintensgeneral( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tintensgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tintensgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TINTENSGeneral";
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

