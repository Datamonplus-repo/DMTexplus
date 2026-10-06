package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.consultahdrsagrupadastinte_wp", "/app.formulaciontinte.consultahdrsagrupadastinte_wp"})
@jakarta.servlet.annotation.MultipartConfig
public final  class consultahdrsagrupadastinte_wp extends GXWebObjectStub
{
   public consultahdrsagrupadastinte_wp( )
   {
   }

   public consultahdrsagrupadastinte_wp( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( consultahdrsagrupadastinte_wp.class ));
   }

   public consultahdrsagrupadastinte_wp( int remoteHandle ,
                                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new consultahdrsagrupadastinte_wp_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new consultahdrsagrupadastinte_wp_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Recetas de Tinte (Agrupacion)";
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

