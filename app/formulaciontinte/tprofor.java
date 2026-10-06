package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.tprofor", "/app.formulaciontinte.tprofor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprofor extends GXWebObjectStub
{
   public tprofor( )
   {
   }

   public tprofor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprofor.class ));
   }

   public tprofor( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprofor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprofor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MANTENIMIENTO PROCESOS FORMULA";
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

