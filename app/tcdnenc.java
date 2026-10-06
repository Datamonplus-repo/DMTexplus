package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcdnenc", "/app.tcdnenc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcdnenc extends GXWebObjectStub
{
   public tcdnenc( )
   {
   }

   public tcdnenc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcdnenc.class ));
   }

   public tcdnenc( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcdnenc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcdnenc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos que NO se pueden utilizar en Cuardeno de Encargos";
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

