package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.duplicacionprocesoquimico", "/app.formulaciontinte.duplicacionprocesoquimico"})
@jakarta.servlet.annotation.MultipartConfig
public final  class duplicacionprocesoquimico extends GXWebObjectStub
{
   public duplicacionprocesoquimico( )
   {
   }

   public duplicacionprocesoquimico( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( duplicacionprocesoquimico.class ));
   }

   public duplicacionprocesoquimico( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new duplicacionprocesoquimico_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new duplicacionprocesoquimico_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Duplicacion de Procesos Quimicos";
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

