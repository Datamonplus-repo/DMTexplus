package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccion.cargasproduccionporprocesoww", "/app.produccion.cargasproduccionporprocesoww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class cargasproduccionporprocesoww extends GXWebObjectStub
{
   public cargasproduccionporprocesoww( )
   {
   }

   public cargasproduccionporprocesoww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( cargasproduccionporprocesoww.class ));
   }

   public cargasproduccionporprocesoww( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new cargasproduccionporprocesoww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new cargasproduccionporprocesoww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Cargas por Proceso";
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

