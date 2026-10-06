package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.entalm", "/app.entalm"})
@jakarta.servlet.annotation.MultipartConfig
public final  class entalm extends GXWebObjectStub
{
   public entalm( )
   {
   }

   public entalm( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( entalm.class ));
   }

   public entalm( int remoteHandle ,
                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new entalm_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new entalm_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Tabla ENTALM";
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

