package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcatdef", "/app.tcatdef"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcatdef extends GXWebObjectStub
{
   public tcatdef( )
   {
   }

   public tcatdef( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcatdef.class ));
   }

   public tcatdef( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcatdef_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcatdef_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Categoría de los defectos";
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

