package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.rmacfor", "/app.formulaciontinte.rmacfor"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rmacfor extends GXWebObjectStub
{
   public rmacfor( )
   {
   }

   public rmacfor( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rmacfor.class ));
   }

   public rmacfor( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rmacfor_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rmacfor_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "RELACION FORMULAS CON MACRO";
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

