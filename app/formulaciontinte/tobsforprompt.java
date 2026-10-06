package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tobsforprompt", "/app.formulaciontinte.tobsforprompt"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tobsforprompt extends GXWebObjectStub
{
   public tobsforprompt( )
   {
   }

   public tobsforprompt( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tobsforprompt.class ));
   }

   public tobsforprompt( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tobsforprompt_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tobsforprompt_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Selecciona OBSERVACIONES";
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

