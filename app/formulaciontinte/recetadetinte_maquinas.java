package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.recetadetinte_maquinas", "/app.formulaciontinte.recetadetinte_maquinas"})
@jakarta.servlet.annotation.MultipartConfig
public final  class recetadetinte_maquinas extends GXWebObjectStub
{
   public recetadetinte_maquinas( )
   {
   }

   public recetadetinte_maquinas( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( recetadetinte_maquinas.class ));
   }

   public recetadetinte_maquinas( int remoteHandle ,
                                  ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new recetadetinte_maquinas_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new recetadetinte_maquinas_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Seleccion Maquinas de Tinte";
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

