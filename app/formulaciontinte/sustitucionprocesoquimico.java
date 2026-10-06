package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.sustitucionprocesoquimico", "/app.formulaciontinte.sustitucionprocesoquimico"})
@jakarta.servlet.annotation.MultipartConfig
public final  class sustitucionprocesoquimico extends GXWebObjectStub
{
   public sustitucionprocesoquimico( )
   {
   }

   public sustitucionprocesoquimico( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( sustitucionprocesoquimico.class ));
   }

   public sustitucionprocesoquimico( int remoteHandle ,
                                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new sustitucionprocesoquimico_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new sustitucionprocesoquimico_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Sustitucion Proceso Quimico";
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

