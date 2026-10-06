package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tparesp", "/app.tparesp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tparesp extends GXWebObjectStub
{
   public tparesp( )
   {
   }

   public tparesp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tparesp.class ));
   }

   public tparesp( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tparesp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tparesp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Especificaciones o Codiciones";
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

