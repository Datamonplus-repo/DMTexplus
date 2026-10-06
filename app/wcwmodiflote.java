package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwmodiflote", "/app.wcwmodiflote"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwmodiflote extends GXWebObjectStub
{
   public wcwmodiflote( )
   {
   }

   public wcwmodiflote( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwmodiflote.class ));
   }

   public wcwmodiflote( int remoteHandle ,
                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwmodiflote_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwmodiflote_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Entradas en Almacen, Modificacion LOte, Albaran Nº";
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

