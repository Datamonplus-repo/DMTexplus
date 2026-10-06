package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcmrepuestodetalle", "/app.wcmrepuestodetalle"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcmrepuestodetalle extends GXWebObjectStub
{
   public wcmrepuestodetalle( )
   {
   }

   public wcmrepuestodetalle( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcmrepuestodetalle.class ));
   }

   public wcmrepuestodetalle( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcmrepuestodetalle_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcmrepuestodetalle_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCMRepuesto Detalle";
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

