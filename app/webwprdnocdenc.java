package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webwprdnocdenc", "/app.webwprdnocdenc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webwprdnocdenc extends GXWebObjectStub
{
   public webwprdnocdenc( )
   {
   }

   public webwprdnocdenc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webwprdnocdenc.class ));
   }

   public webwprdnocdenc( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webwprdnocdenc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webwprdnocdenc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Productos que no se pueden utilizar en Cuaderno de Encargos";
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

