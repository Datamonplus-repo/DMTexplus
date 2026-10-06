package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.formulaciontinte.mtoformulastinte_procesosgeneral", "/app.formulaciontinte.mtoformulastinte_procesosgeneral"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mtoformulastinte_procesosgeneral extends GXWebObjectStub
{
   public mtoformulastinte_procesosgeneral( )
   {
   }

   public mtoformulastinte_procesosgeneral( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mtoformulastinte_procesosgeneral.class ));
   }

   public mtoformulastinte_procesosgeneral( int remoteHandle ,
                                            ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mtoformulastinte_procesosgeneral_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mtoformulastinte_procesosgeneral_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Mto Formulas Tinte_Procesos General";
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

