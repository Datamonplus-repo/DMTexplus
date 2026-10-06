package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.wcsituacionprocesoquimico", "/app.formulaciontinte.wcsituacionprocesoquimico"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcsituacionprocesoquimico extends GXWebObjectStub
{
   public wcsituacionprocesoquimico( )
   {
   }

   public wcsituacionprocesoquimico( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcsituacionprocesoquimico.class ));
   }

   public wcsituacionprocesoquimico( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcsituacionprocesoquimico_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcsituacionprocesoquimico_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Procesos Quimicos (Colores)";
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

