package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.arel_hojaderuta", "/app.arel_hojaderuta"})
@jakarta.servlet.annotation.MultipartConfig
public final  class arel_hojaderuta extends GXWebObjectStub
{
   public arel_hojaderuta( )
   {
   }

   public arel_hojaderuta( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( arel_hojaderuta.class ));
   }

   public arel_hojaderuta( int remoteHandle ,
                           ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new arel_hojaderuta_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new arel_hojaderuta_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "rel_Hoja De Ruta";
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

