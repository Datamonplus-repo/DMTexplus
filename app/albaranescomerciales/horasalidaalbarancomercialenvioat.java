package app.albaranescomerciales ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.albaranescomerciales.horasalidaalbarancomercialenvioat", "/app.albaranescomerciales.horasalidaalbarancomercialenvioat"})
@jakarta.servlet.annotation.MultipartConfig
public final  class horasalidaalbarancomercialenvioat extends GXWebObjectStub
{
   public horasalidaalbarancomercialenvioat( )
   {
   }

   public horasalidaalbarancomercialenvioat( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( horasalidaalbarancomercialenvioat.class ));
   }

   public horasalidaalbarancomercialenvioat( int remoteHandle ,
                                             ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new horasalidaalbarancomercialenvioat_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new horasalidaalbarancomercialenvioat_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Hora Salida Albaran Comercial Envio AT";
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

