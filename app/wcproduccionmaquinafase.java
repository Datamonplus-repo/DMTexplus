package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcproduccionmaquinafase", "/app.wcproduccionmaquinafase"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcproduccionmaquinafase extends GXWebObjectStub
{
   public wcproduccionmaquinafase( )
   {
   }

   public wcproduccionmaquinafase( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcproduccionmaquinafase.class ));
   }

   public wcproduccionmaquinafase( int remoteHandle ,
                                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcproduccionmaquinafase_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcproduccionmaquinafase_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCProduccion Maquina Fase";
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

