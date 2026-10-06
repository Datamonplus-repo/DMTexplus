package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwprdnocdenc", "/app.wcwprdnocdenc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwprdnocdenc extends GXWebObjectStub
{
   public wcwprdnocdenc( )
   {
   }

   public wcwprdnocdenc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwprdnocdenc.class ));
   }

   public wcwprdnocdenc( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwprdnocdenc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwprdnocdenc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Productos que NO se pueden utilizar en Cuardeno de Encargos";
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

