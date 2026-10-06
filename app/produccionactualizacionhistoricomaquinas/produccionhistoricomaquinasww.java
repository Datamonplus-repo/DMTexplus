package app.produccionactualizacionhistoricomaquinas ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.produccionactualizacionhistoricomaquinas.produccionhistoricomaquinasww", "/app.produccionactualizacionhistoricomaquinas.produccionhistoricomaquinasww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class produccionhistoricomaquinasww extends GXWebObjectStub
{
   public produccionhistoricomaquinasww( )
   {
   }

   public produccionhistoricomaquinasww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( produccionhistoricomaquinasww.class ));
   }

   public produccionhistoricomaquinasww( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new produccionhistoricomaquinasww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new produccionhistoricomaquinasww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Producción Actualización Historico de Máquinas";
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

