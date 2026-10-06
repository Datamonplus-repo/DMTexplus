package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbdet", "/app.talbdet"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbdet extends GXWebObjectStub
{
   public talbdet( )
   {
   }

   public talbdet( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbdet.class ));
   }

   public talbdet( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbdet_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbdet_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Almacen de Entrada, con detalle de rollos";
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

