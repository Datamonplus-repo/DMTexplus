package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tcalpro", "/app.tcalpro"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tcalpro extends GXWebObjectStub
{
   public tcalpro( )
   {
   }

   public tcalpro( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tcalpro.class ));
   }

   public tcalpro( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tcalpro_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tcalpro_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Documento Transporte Proveedor";
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

